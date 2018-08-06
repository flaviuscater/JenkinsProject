@Library('MyJenkinsPipeline')
import static com.cleverbuilder.GlobalVars_

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