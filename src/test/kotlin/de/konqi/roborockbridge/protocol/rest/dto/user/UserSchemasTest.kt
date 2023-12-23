package de.konqi.roborockbridge.protocol.rest.dto.user

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.json.JsonTest
import java.util.*

@JsonTest
class UserSchemasTest(@Autowired val objectMapper: ObjectMapper) {
    @Test
    fun testDeserialize() {
        assertDoesNotThrow {
            val jsonString = String(Base64.getDecoder().decode(BLOB))
            val userSchemas: UserApiResponseDto<List<UserSchema>> = objectMapper.readValue(jsonString)
            println(userSchemas)
        }
    }

    companion object {
        const val BLOB =
            "eyJhcGkiOm51bGwsInJlc3VsdCI6W3siaWQiOjcyNzg5MiwibmFtZSI6Ilx1RDgzRFx1REVCRlx1RDgzRFx1REVDMVx1RDgzRFx1REVCRCIsInBhcmFtIjoie1widHJpZ2dlcnNcIjpbXSxcImFjdGlvblwiOntcInR5cGVcIjpcIlNcIixcIml0ZW1zXCI6W3tcImlkXCI6MSxcInR5cGVcIjpcIkNNRFwiLFwibmFtZVwiOlwiQmF0aHJvb21cIixcImVudGl0eUlkXCI6XCIzUzg2VWg2aVF2VVNQQ1Q4ZUhmM0ZOXCIsXCJwYXJhbVwiOlwie1xcXCJpZFxcXCI6MSxcXFwibWV0aG9kXFxcIjpcXFwiZG9fc2NlbmVzX3NlZ21lbnRzXFxcIixcXFwicGFyYW1zXFxcIjp7XFxcImRhdGFcXFwiOlt7XFxcInRpZFxcXCI6XFxcIjE2ODU4MDI0MzEyMjNcXFwiLFxcXCJzZWdzXFxcIjpbe1xcXCJzaWRcXFwiOjIwfV0sXFxcIm1hcF9mbGFnXFxcIjowLFxcXCJmYW5fcG93ZXJcXFwiOjEwMyxcXFwid2F0ZXJfYm94X21vZGVcXFwiOjIwMCxcXFwibW9wX21vZGVcXFwiOjMwMCxcXFwibW9wX3RlbXBsYXRlX2lkXFxcIjozMDAsXFxcInJlcGVhdFxcXCI6MixcXFwiY2xlYW5fb3JkZXJfbW9kZVxcXCI6MH1dLFxcXCJzb3VyY2VcXFwiOjEwMX19XCIsXCJmaW5pc2hEcElkc1wiOlsxMzBdfSx7XCJpZFwiOjIsXCJ0eXBlXCI6XCJDTURcIixcIm5hbWVcIjpcIkJhdGhyb29tXCIsXCJlbnRpdHlJZFwiOlwiM1M4NlVoNmlRdlVTUENUOGVIZjNGTlwiLFwicGFyYW1cIjpcIntcXFwiaWRcXFwiOjIsXFxcIm1ldGhvZFxcXCI6XFxcImRvX3NjZW5lc19zZWdtZW50c1xcXCIsXFxcInBhcmFtc1xcXCI6e1xcXCJkYXRhXFxcIjpbe1xcXCJ0aWRcXFwiOlxcXCIxNjg1ODAyNDU0OTEzXFxcIixcXFwic2Vnc1xcXCI6W3tcXFwic2lkXFxcIjoyMH1dLFxcXCJtYXBfZmxhZ1xcXCI6MCxcXFwiZmFuX3Bvd2VyXFxcIjoxMDUsXFxcIndhdGVyX2JveF9tb2RlXFxcIjoyMDMsXFxcIm1vcF9tb2RlXFxcIjozMDMsXFxcIm1vcF90ZW1wbGF0ZV9pZFxcXCI6MzAzLFxcXCJyZXBlYXRcXFwiOjIsXFxcImNsZWFuX29yZGVyX21vZGVcXFwiOjB9XSxcXFwic291cmNlXFxcIjoxMDF9fVwiLFwiZmluaXNoRHBJZHNcIjpbMTMwXX1dfSxcIm1hdGNoVHlwZVwiOlwiTk9ORVwifSIsImVuYWJsZWQiOnRydWUsImV4dHJhIjpudWxsLCJ0eXBlIjoiV09SS0ZMT1cifSx7ImlkIjo2Mjc3NjcsIm5hbWUiOiJcdUQ4M0NcdURGRTAiLCJwYXJhbSI6IntcInRyaWdnZXJzXCI6W10sXCJhY3Rpb25cIjp7XCJ0eXBlXCI6XCJTXCIsXCJpdGVtc1wiOlt7XCJpZFwiOjEsXCJ0eXBlXCI6XCJDTURcIixcIm5hbWVcIjpcIlwiLFwiZW50aXR5SWRcIjpcIjNTODZVaDZpUXZVU1BDVDhlSGYzRk5cIixcInBhcmFtXCI6XCJ7XFxcImlkXFxcIjoxLFxcXCJtZXRob2RcXFwiOlxcXCJkb19zY2VuZXNfYXBwX3N0YXJ0XFxcIixcXFwicGFyYW1zXFxcIjpbe1xcXCJmYW5fcG93ZXJcXFwiOjEwMyxcXFwid2F0ZXJfYm94X21vZGVcXFwiOjIwMCxcXFwibW9wX21vZGVcXFwiOjMwMCxcXFwibW9wX3RlbXBsYXRlX2lkXFxcIjozMDAsXFxcInJlcGVhdFxcXCI6MCxcXFwic291cmNlXFxcIjoxMDF9XX1cIixcImZpbmlzaERwSWRzXCI6WzEzMF19LHtcImlkXCI6MyxcInR5cGVcIjpcIkNNRFwiLFwibmFtZVwiOlwiXCIsXCJlbnRpdHlJZFwiOlwiM1M4NlVoNmlRdlVTUENUOGVIZjNGTlwiLFwicGFyYW1cIjpcIntcXFwiaWRcXFwiOjMsXFxcIm1ldGhvZFxcXCI6XFxcImRvX3NjZW5lc19hcHBfc3RhcnRcXFwiLFxcXCJwYXJhbXNcXFwiOlt7XFxcImZhbl9wb3dlclxcXCI6MTA1LFxcXCJ3YXRlcl9ib3hfbW9kZVxcXCI6MjAyLFxcXCJtb3BfbW9kZVxcXCI6MzAwLFxcXCJtb3BfdGVtcGxhdGVfaWRcXFwiOjMwMCxcXFwicmVwZWF0XFxcIjowLFxcXCJzb3VyY2VcXFwiOjEwMX1dfVwiLFwiZmluaXNoRHBJZHNcIjpbMTMwXX1dfSxcIm1hdGNoVHlwZVwiOlwiTk9ORVwifSIsImVuYWJsZWQiOnRydWUsImV4dHJhIjpudWxsLCJ0eXBlIjoiV09SS0ZMT1cifSx7ImlkIjo2MTE0MDksIm5hbWUiOiJcdUQ4M0NcdURGNzJcdUQ4M0NcdURGN0TvuI8iLCJwYXJhbSI6IntcInRyaWdnZXJzXCI6W10sXCJhY3Rpb25cIjp7XCJ0eXBlXCI6XCJTXCIsXCJpdGVtc1wiOlt7XCJpZFwiOjEsXCJ0eXBlXCI6XCJDTURcIixcIm5hbWVcIjpcIlwiLFwiZW50aXR5SWRcIjpcIjNTODZVaDZpUXZVU1BDVDhlSGYzRk5cIixcInBhcmFtXCI6XCJ7XFxcImlkXFxcIjoxLFxcXCJtZXRob2RcXFwiOlxcXCJkb19zY2VuZXNfem9uZXNcXFwiLFxcXCJwYXJhbXNcXFwiOntcXFwiZGF0YVxcXCI6W3tcXFwidGlkXFxcIjpcXFwiMTY4MjkzNTA3ODQxNlxcXCIsXFxcInpvbmVzXFxcIjpbe1xcXCJ6aWRcXFwiOjAsXFxcInJlcGVhdFxcXCI6MX1dLFxcXCJtYXBfZmxhZ1xcXCI6MCxcXFwiZmFuX3Bvd2VyXFxcIjoxMDMsXFxcIndhdGVyX2JveF9tb2RlXFxcIjoyMDAsXFxcIm1vcF9tb2RlXFxcIjozMDAsXFxcIm1vcF90ZW1wbGF0ZV9pZFxcXCI6MzAwLFxcXCJyZXBlYXRcXFwiOjEsXFxcImNsZWFuX29yZGVyX21vZGVcXFwiOjB9XSxcXFwic291cmNlXFxcIjoxMDF9fVwiLFwiZmluaXNoRHBJZHNcIjpbMTMwXX0se1wiaWRcIjoyLFwidHlwZVwiOlwiQ01EXCIsXCJuYW1lXCI6XCJLaXRjaGVuXCIsXCJlbnRpdHlJZFwiOlwiM1M4NlVoNmlRdlVTUENUOGVIZjNGTlwiLFwicGFyYW1cIjpcIntcXFwiaWRcXFwiOjIsXFxcIm1ldGhvZFxcXCI6XFxcImRvX3NjZW5lc19zZWdtZW50c1xcXCIsXFxcInBhcmFtc1xcXCI6e1xcXCJkYXRhXFxcIjpbe1xcXCJ0aWRcXFwiOlxcXCIxNjgyOTM1MTExOTAyXFxcIixcXFwic2Vnc1xcXCI6W3tcXFwic2lkXFxcIjoyM31dLFxcXCJtYXBfZmxhZ1xcXCI6MCxcXFwiZmFuX3Bvd2VyXFxcIjoxMDMsXFxcIndhdGVyX2JveF9tb2RlXFxcIjoyMDAsXFxcIm1vcF9tb2RlXFxcIjozMDAsXFxcIm1vcF90ZW1wbGF0ZV9pZFxcXCI6MzAwLFxcXCJyZXBlYXRcXFwiOjEsXFxcImNsZWFuX29yZGVyX21vZGVcXFwiOjB9XSxcXFwic291cmNlXFxcIjoxMDF9fVwiLFwiZmluaXNoRHBJZHNcIjpbMTMwXX1dfSxcIm1hdGNoVHlwZVwiOlwiTk9ORVwifSIsImVuYWJsZWQiOnRydWUsImV4dHJhIjpudWxsLCJ0eXBlIjoiV09SS0ZMT1cifV0sInN0YXR1cyI6Im9rIiwic3VjY2VzcyI6dHJ1ZX0="
    }
}