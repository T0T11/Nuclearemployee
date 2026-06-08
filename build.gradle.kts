plugins {
    id("java")
    application
}

application {
    mainClass.set("com.sprinfield.Main")
}
tasks.jar {
    manifest {
        attributes["Main-Class"] = "com.springfield.powerplant.App"    }
}

group = "com.springfield"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}




dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}