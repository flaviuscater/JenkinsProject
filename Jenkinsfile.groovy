
import src.GlobalVars

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