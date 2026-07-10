Param(
    [string]$cmd = "help",
    [string]$msg = ""
)

function Show-Help {
    Write-Host "git-auto PowerShell helper"
    Write-Host "Usage: .\git-auto.ps1 -cmd <status|commitpush|branch|checkout|pull|fetch|stash|pop|help> [-msg \"message\"]"
}

$action = $cmd.ToLower()

switch ($action) {
    "status" { git status }
    "commitpush" {
        if ([string]::IsNullOrWhiteSpace($msg)) { $msg = Read-Host "Commit message" }
        git add -A
        git commit -m $msg
        if ($LASTEXITCODE -eq 0) { git push } else { Write-Host "Commit failed." }
    }
    "branch" {
        if ([string]::IsNullOrWhiteSpace($msg)) { $msg = Read-Host "New branch name" }
        git checkout -b $msg
    }
    "checkout" {
        if ([string]::IsNullOrWhiteSpace($msg)) { $msg = Read-Host "Branch to checkout" }
        git checkout $msg
    }
    "pull" { git pull --rebase }
    "fetch" { git fetch --all }
    "stash" { git stash }
    "pop" { git stash pop }
    default { Show-Help }
}
