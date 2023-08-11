plugins {
    id("application") 
    id("java") 
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.micronaut.platform:micronaut-platform:4.0.3"))
    implementation("io.micronaut.starter:micronaut-starter-aws-cdk:4.0.0") {
      exclude(group = "software.amazon.awscdk", module = "aws-cdk-lib")
    }
    implementation("software.amazon.awscdk:apigatewayv2-alpha:2.84.0-alpha.0")
    implementation("software.amazon.awscdk:apigatewayv2-integrations-alpha:2.84.0-alpha.0")
    implementation("software.amazon.awscdk:aws-cdk-lib:2.84.0")
    testImplementation(platform("io.micronaut.platform:micronaut-platform:4.0.3"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
}
application {
    mainClass.set("com.kodwa.Main")
}
tasks.withType<Test> {
    useJUnitPlatform()
}

