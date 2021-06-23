pipeline {
  agent any
  stages {
    stage('Init') {
      steps {
        echo 'Hi, this is first step in init stage'
        echo 'this is the second step in init stage'
      }
    }
    stage('Build') {
      steps {
        echo 'Building sample maven project'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying in staging Area'
      }
    }
  }
}
