# Shared Folder - University project
## Shared Folder Server
Server side of Shared Folder application

## Pre Instllation
make sure you have docker engine up and running

## Running
To run type in terminal:
```docker-compose up```

## Environment Variable
| Name          | Description                                      | Default value                          |
| :---:         | :---:                                           | :---:                                   |
| `LOG_LEVEL`   | Log level                                       | `INFO`                                  |
| `DB_URL`      | Database URL                                    | `jdbc:postgresql://localhost:5432/file` |
| `DB_USERNAME` | Database URL                                    | `postgres`                              |
| `DB_PASSWORD` | Database URL                                    | `postgres`                              |
| `DB_MIGRATION_ENABLED` | Enable/Disable flyway migration        | `true`                                  |

