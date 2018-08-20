<<<<<<< HEAD
=======

>>>>>>> 0479fab4d43dc904a64e733cdb50af8cae2b8211
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "build stage"
                checkpoint env.STAGE_NAME
            }
        }
        
        stage('Deploy') {
            steps {
                echo "deploy stage"
                checkpoint env.STAGE_NAME
            }
        }

    }
}
