pipeline {
    agent any
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/muskan501/devops-project']])
                bat 'mvn clean install'
            }
        }
         stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t muskankapoor/devops-integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'docker-pwd1', variable: 'dockerpwd')]) {
                    bat 'docker login -u muskankapoor -p ${dockerpwd}'
}
                    bat 'docker push muskankapoor/devops-integration'
                }
            }
        }
    }
}
