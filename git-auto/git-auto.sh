#!/usr/bin/env bash
set -e
cmd=${1:-help}
msg=${2:-}

show_help(){
  cat <<EOF
Usage: ./git-auto.sh <status|commitpush|branch|checkout|pull|fetch|stash|pop|help> [message]
EOF
}

case "$cmd" in
  status)
    git status
    ;;
  commitpush)
    if [ -z "$msg" ]; then
      read -p "Commit message: " msg
    fi
    git add -A
    git commit -m "$msg"
    git push
    ;;
  branch)
    if [ -z "$msg" ]; then
      read -p "New branch name: " msg
    fi
    git checkout -b "$msg"
    ;;
  checkout)
    if [ -z "$msg" ]; then
      read -p "Branch to checkout: " msg
    fi
    git checkout "$msg"
    ;;
  pull)
    git pull --rebase
    ;;
  fetch)
    git fetch --all
    ;;
  stash)
    git stash
    ;;
  pop)
    git stash pop
    ;;
  *)
    show_help
    ;;
esac
