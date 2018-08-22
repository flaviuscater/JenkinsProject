
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
               // checkpoint env.STAGE_NAME
            }
        }

    }
}
