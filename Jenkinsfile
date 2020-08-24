pipeline { 
    agent any  
    stages {
      stage('pre')
       when {
            branch "master"
        }
        steps {
          echo 'This is master' 
        }
    }
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
    }
}
