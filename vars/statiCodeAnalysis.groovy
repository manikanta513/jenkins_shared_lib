def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh '/opt/apache-maven-3.6.3/bin/mvn clean package sonar:sonar'
    }
}
