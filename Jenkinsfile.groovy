import com.cleverbuilder.GlobalVars

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo GlobalVars.groovy
            }
        }

    }
}