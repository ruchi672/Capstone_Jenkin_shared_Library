def call(String mvnaction) {
  pipeline {
       agent any
       stages {
           stage("Clean") {
               steps {
                script {
                    if ("${mvnaction}" == "Clean") {
                        echo 'Clean'
                    }
                }
           }
       }
        stage("Test") {
               steps {
                script {
                    if ("${mvnaction}" == "Test") {
                        echo 'Test'
                    }
                }
           }
       }
        stage("Install") {
               steps {
                script {
                    if ("${mvnaction}" == "Install") {
                        echo 'Install'
                    }
                }
           }
       }
   }
}
}
