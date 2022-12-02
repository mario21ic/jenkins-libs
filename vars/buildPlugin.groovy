def call(Map config) {
    node {
        echo "git url: \"https://github.com/jenkinsci/${config.name}-plugin.git\""
        //sh 'mvn install'
        echo 'mvn install'
        //mail to: '...', subject: "${config.name} plugin build", body: '...'
    }
}

