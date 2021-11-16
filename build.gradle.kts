import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "me.devwckd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

shadow {

}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }

    test {
        useJUnitPlatform()
    }

    shadowJar {
        manifest.attributes("Main-Class" to "me.devwckd.grao_trial.GraoTrialApplicationEntryKt")
    }

    build {
        dependsOn(shadowJar)
    }
}


