def call(Map config) {
    node {
        git url: "https://github.com/jenkinsci/${config.name}-plugin.git"    // with varibale git url
        sh 'mkdir test'
    }
}

