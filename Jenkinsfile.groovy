
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "bla"
                checkpoint env.STAGE_NAME
            }
        }

    }
}
