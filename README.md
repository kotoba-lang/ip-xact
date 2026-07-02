# kotoba-lang/ip-xact

Zero-dep portable `.cljc` — restored from the legacy `kami-engine/kami-ip`
Rust crate (deleted in kotoba-lang/kami-engine PR #82 "Remove Rust workspace
from kami-engine") as part of the **clj-wgsl migration** (ADR-2607010930,
`com-junkawasaki/root`).

KAMI IP Management: IP-XACT component catalog, bus protocol generation,
NoC topology synthesis, and CDC analysis.

**Named `ip-xact`, not `ip`** — `ip` is dangerously ambiguous (IP address
vs. intellectual property) in a large, actively-developed org, same class
of correction as `kami-si` -> `signal-integrity`.

## Status

Scaffold only — the CLJC restoration is pending.

## Develop

```bash
clojure -M:test
```
