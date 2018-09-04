
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "build stage"
                sleep 5
                checkpoint STAGE_NAME
            }
        }
        
        stage('Deploy') {
            steps {
                echo "deploy stage"
                //sleep 5
                //checkpoint STAGE_NAME
            }
        }

    }
}
