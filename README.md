# ProgramingProplemTemplate

Template for solving problems found on websites like https://open.kattis.com/, with Kotlin (or Java).

To fetch and view all branches:
```
git branch -r | grep -v '\->' | sed "s,\x1B\[[0-9;]*[a-zA-Z],,g" | while read remote; do git branch --track "${remote#origin/}" "$remote"; done
git fetch --all
git pull --all
git branch
```
Source: https://stackoverflow.com/questions/10312521/how-do-i-fetch-all-git-branches
