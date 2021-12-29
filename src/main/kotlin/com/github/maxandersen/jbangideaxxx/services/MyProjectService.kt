package com.github.maxandersen.jbangideaxxx.services

import com.intellij.openapi.project.Project
import com.github.maxandersen.jbangideaxxx.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
