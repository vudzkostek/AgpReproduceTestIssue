import org.gradle.api.JavaVersion

object BuildConfig {

    const val MIN_SDK = 21
    const val TARGET_SDK = 30
    val JAVA_VERSION = JavaVersion.VERSION_1_8
    val JAVA_VERSION_NAME = JAVA_VERSION.toString()
}