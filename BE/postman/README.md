## Postman tutorial
Tutorials:
- `https://toolsqa.com/postman/postman-tutorial/`

Newman Integration
- Install newman: `npm install -g newman`

ReportPortal Integration
- Install agent: `npm install -g @reportportal/newman-reporter-agent-js-postman`
- Resources: `https://github.com/reportportal/agent-js-postman`
- Install RP: `curl https://raw.githubusercontent.com/reportportal/reportportal/master/docker-compose.yml -o docker-compose.yml`
- Start RP: `docker-compose -p reportportal up -d --force-recreate`
- Access RP: `http://localhost:8080/ui/#login`