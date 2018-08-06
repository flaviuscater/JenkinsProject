
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo GlobalVars.foo
            }
        }

    }
}