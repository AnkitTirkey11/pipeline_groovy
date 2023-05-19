pipeline{
  agent any
  stages{
    stage('Checking'){
      steps{
        echo 'Hello World'
      }
    }
  }
}
