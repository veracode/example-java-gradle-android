package example.sourceclear.com.sourceclearexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.apache.commons.fileupload.MultipartStream
import org.apache.xml.security.signature.XMLSignatureInput
import org.mindrot.jbcrypt.BCrypt
import java.io.ByteArrayInputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val candidate = "test"
        val hashed = BCrypt.hashpw(candidate, BCrypt.gensalt(12))

        BCrypt.checkpw(candidate, hashed)

        filterXMLSignature()

        setContentView(R.layout.activity_main)
    }

    private fun filterXMLSignature() {
      val bytes = ByteArray(256, { _ -> 0 })

      try {
        MultipartStream(ByteArrayInputStream(bytes), bytes);
      } catch (ignored : IOException) {
      }

      XMLSignatureInput(bytes).addNodeFilter(null);
    }
}
