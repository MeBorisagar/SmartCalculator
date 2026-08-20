# Smart Calculator

Smart Calculator is a Java-based calculator application designed to provide accurate and reliable mathematical calculations through a simple user interface.



---

### Contributors

- **Project Owner** : Meet Borisagar

- **Reviewers** : Aniket Singh, Vineet Verma

---

## Branching Strategy

The project uses a feature-branch development workflow with two primary branches:

### `dev` — Development Branch

`dev` is the main development and integration branch.

All new features, bug fixes, refactoring, tests, and other development work are merged into `dev`.

New branches are created from `dev`.

Example:

```text
dev
└── feature/basic_CLI_loop
```

After the work is completed:

```text
feature/basic_CLI_loop → dev

```

### `main` — Stable Branch
main contains stable and release-ready versions of the project.

Once the work in dev has been completed, tested, and considered stable, it is merged into main.

```text
dev → main
```


Direct development on main should be avoided.

---





## Project Status

**Status:** In Development

| Phase | Branch                     | Description | Status    |
|---|----------------------------|---|-----------|
| Week 1 | `dev`                      | Project setup and Maven configuration | Completed |
| Week 2 | `docs/srs`                 | Requirements analysis and design documentation | Completed |
| Week 3 | `feature/basic_CLI_loop`   | Basic calculator CLI loop | Completed |
| Week 4 | `feature/w4_OOP_Structure` | OOP structure and code hygiene | Completed |
| Week 5 | —                          | OOP pillars and polymorphism | Planned   |
| Week 6 | —                          | Robustness and code review | Planned   |
| Week 7 | —                          | Logic, algorithms and debugging | Planned   |
| Week 8 | —                          | Static web UI and web awareness | Planned   |

---
