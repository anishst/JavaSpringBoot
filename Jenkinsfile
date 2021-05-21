pipeline {
    // https://github.boozallencsn.com/krajewski-frank/jenkins-examples/blob/mvn-ssh-release/Jenkinsfile
//     agent { dockerfile true }
    agent any

    tools {
        maven 'Maven 3'   // maven should be setup as a tool in Jenkins
    }

        environment {
            CLOUD_RUN_FLAG = "YES"
        }

    triggers {
        //     Poll scm every 2 mins
        pollSCM 'H/2 * * * *'
    }
    stages {

        stage('Build App '){
            steps {
                dir("${env.WORKSPACE}") {
                    sh "mvn --version"
                    echo "Building App app...."
                    sh "mvn install -Dmaven.test.skip=true"
                 }
            }
        }

         stage('Web Test'){
             agent {
                 docker { image 'selenium/standalone-chrome:latest' }
             }
            steps {
                dir("${env.WORKSPACE}") {
                    echo "Running Java Cucumber Tests...."
                    sh "pwd"
                    sh "curl http://chrome:4444/wd/hub"
                    sh "mvn test -Dtest=WebTests"

                 }
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying Code..."
                echo "Deployment Completed!"
            }
        }
    }

        // post {
        //     always {
        //         record test results
        //         junit '**/reports/*.xml'
        //     }
        // }
}
