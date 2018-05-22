pipeline {
  agent {
    label 'worker*'
  }

  stages {
    stage('build'){
      steps {

        sh 'ant -f build.xml -v'
      }
    }
  }
}