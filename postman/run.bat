@echo off
newman run TestCollection.postman_collection.json ^
    -r @reportportal/agent-js-postman ^
    --reporter-@reportportal/agent-js-postman-debug=true ^
    --reporter-@reportportal/agent-js-postman-endpoint=https://reportportal.development.cloud.riag.digital/api/v1 ^
    --reporter-@reportportal/agent-js-postman-api-key=ecom_OsRu7Wk9QX6PTro3pcEZQNa5tPyCIegEPoja_oEI8ZPFGVI_BXIfvgQxnaOOx45Q ^
    --reporter-@reportportal/agent-js-postman-launch=eCommerce ^
    --reporter-@reportportal/agent-js-postman-project=ecommerce_websolutions ^
    --reporter-@reportportal/agent-js-postman-description=eCommerce ^
    --reporter-@reportportal/agent-js-postman-attributes=layer:system;e_commerce ^
    -x