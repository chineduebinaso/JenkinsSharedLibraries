def step1() {
    echo 'Running Step 1'
    // Add your actual implementation code for Step 1 here
    // For example:
    sh 'echo "sh "Build"'
    sh "mvn clean package"
}

def step2() {
    echo 'Running Step 2'
    // Add your actual implementation code for Step 2 here
    // For example:
    sh 'echo "Sonarqube report"'
    sh "mvn clean sonar:sonar"
}

def step3() {
    echo 'Running Step 3'
    // Add your actual implementation code for Step 3 here
    // For example:
    sh 'echo "Upload to Nexus"'
    sh "mvn clean deploy"
}
