pipeline {
  agent {
    label 'worker 1'
  }

  stages {
    stage('build'){
      steps {

        sh 'ant -f build.xml -v'
      }
    }
  }
}