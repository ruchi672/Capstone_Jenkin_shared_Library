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
   }
}
}
