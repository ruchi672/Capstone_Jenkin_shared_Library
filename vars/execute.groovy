def call(String mvnaction) {
  pipeline {
       agent any
       stages {
           stage("Clean") {
                when {
       			expression { mvnaction == "Clean" }
    			}
   		 steps {
       		 	echo 'run this Clean - ony if the branch = master branch'
    			}
           }
       }
       stages {
           stage("Test") {
                when {
       			expression { mvnaction == "Test" }
    			}
   		 steps {
       		 	echo 'run this Test- ony if the branch = master branch'
    			}
           }
       }
   }
}

