package com.mario21ic

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

return this

/* From pipeline
def z = new org.foo.Zot()
z.checkOutFrom(repo)
*/
