# git-auto

Small helper scripts to automate common Git workflows.

Files:
- git-auto.ps1 — PowerShell helper (Windows)
- git-auto.sh — Bash helper (Linux/macOS/WSL)

Examples

PowerShell:

```powershell
# commit and push (prompts for message if not provided)
.\git-auto.ps1 -cmd commitpush -msg "Fix bug"

# create a new branch
.\git-auto.ps1 -cmd branch -msg "feature/x"
```

Bash:

```bash
# commit and push (prompts for message if not provided)
./git-auto.sh commitpush "Fix bug"

# create a new branch
./git-auto.sh branch feature/x
```

Next steps
- Make the scripts executable (chmod +x git-auto.sh) in Unix environments.
- Optionally integrate with VS Code tasks or add shell aliases.
