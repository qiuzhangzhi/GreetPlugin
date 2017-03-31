package com.grasp

import org.gradle.api.Project
import org.gradle.api.Plugin

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create("greeting", GreetingPluginExtension)
        project.task('hello') {
            doLast {
                println "${project.greeting.message} from ${project.greeting.greeter}"
            }
        }
    }
}

class GreetingPluginExtension {
    String message = "df"
    String greeter = "kk"
}
