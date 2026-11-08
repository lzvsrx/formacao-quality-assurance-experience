plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android { namespace = "br.dev.qa"; compileSdk = 35
 defaultConfig { applicationId = "br.dev.qa"; minSdk = 24; targetSdk = 35; versionCode = 1; versionName = "1.0"; testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner" }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
 kotlinOptions { jvmTarget = "17" }
}
dependencies { androidTestImplementation("androidx.test:core:1.6.1"); androidTestImplementation("androidx.test.ext:junit:1.2.1"); androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1") }
