@Library('MyJenkinsPipeline')_
import static com.cleverbuilder.*

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'GlobalVars.foo'
            }
        }

    }
}