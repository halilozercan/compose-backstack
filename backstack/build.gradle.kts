plugins {
    id("com.android.library")
    id("default-android-config")
    kotlin("android")
    id("org.jetbrains.dokka")
}

dependencies {
    compileOnly(Dependencies.Compose.tooling)

    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Compose.foundation)

    testImplementation(Dependencies.Test.junit)
    testImplementation(Dependencies.Test.truth)

    androidTestImplementation(Dependencies.AndroidX.junitExt)
    androidTestImplementation(Dependencies.Compose.test)
    androidTestImplementation(Dependencies.Test.truth)
}
