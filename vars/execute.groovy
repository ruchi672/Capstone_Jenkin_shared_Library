def call(String mvnaction) {
  pipeline {
       agent any
       stages {
           stage("Clean") {
                when {
       			"${mvnaction}" == "Clean"
    			}
   		 steps {
       		 	echo 'run this stage - only if clean stage'
    			}
           }
       }
   }
}
