pipeline{
  agent any
  stages{
    stage('Stage Name : Hello'){
      steps{
        echo 'Hello World'
      }
    }
  }
}
