def call(String mvnaction) {
  pipeline {
       agent any
       stages {
           stage("Clean") {
                when {
       			expression { mvnaction == "Clean" }
    			}
   		 steps {
       		 	echo 'run this stage - ony if the branch = master branch'
    			}
           }
       }
   }
}
