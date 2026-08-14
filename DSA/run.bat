@echo off
cd /d "%~dp0"
javac Main2.java
if %errorlevel% neq 0 (
    echo Compilation failed.
    exit /b %errorlevel%
)
java Main2


@REM DSA/run.bat
