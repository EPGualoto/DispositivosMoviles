// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins que afecten a todo el proyecto

plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.ksp) apply false

    id("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false
}