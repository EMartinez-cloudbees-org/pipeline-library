//imageNameTag.groovy
def call(body) {
  tokens = "${env.JOB_NAME}".tokenize('/')
  env.IMAGE_REPO = env.repoOwner
  //env.IMAGE_NAME = platformName
  env.IMAGE_TAG = tokens[tokens.size()-1]
}
