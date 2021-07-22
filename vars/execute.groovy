def call(String mvnaction) {
    
              if ("${mvnaction}" == "Clean")
                    {
                    sh """
                        echo Maven Clean
                       """
                    }
              else if ("${mvnaction}" == "Compile")
                    {
                   sh """
                        echo Maven Compile
                       """
                    }
               else if ("${mvnaction}" == "Test")
                    {
                    sh """
                        echo Maven Test
                       """
                    }
                 else if ("${mvnaction}" == "Install")
                    {
                    sh """
                        echo Maven Install
                       """
                    }
}
