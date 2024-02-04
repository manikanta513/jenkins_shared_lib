def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh '/opt/maven/bin/mvn clean package sonar:sonar'
    }
}
