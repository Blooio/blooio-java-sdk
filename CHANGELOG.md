# Changelog

## 0.1.0 (2026-03-03)

Full Changelog: [v0.0.4...v0.1.0](https://github.com/Blooio/blooio-java-sdk/compare/v0.0.4...v0.1.0)

### Features

* **client:** add `HttpRequest#url()` method ([dd2bca3](https://github.com/Blooio/blooio-java-sdk/commit/dd2bca38596e4ef7626ef23d1a73ce7678a4375e))
* **client:** allow configuring dispatcher executor service ([4f0db30](https://github.com/Blooio/blooio-java-sdk/commit/4f0db3097b9b0c1876887115146216c0b3a50c30))
* **client:** send `X-Stainless-Kotlin-Version` header ([f6d45cd](https://github.com/Blooio/blooio-java-sdk/commit/f6d45cddc950b7443fb661d4804c4986ef89c187))


### Bug Fixes

* **client:** disallow coercion from float to int ([3ee28c5](https://github.com/Blooio/blooio-java-sdk/commit/3ee28c5e8bd033c3d96134fb13903941de2e8735))
* **client:** fully respect max retries ([2ddb812](https://github.com/Blooio/blooio-java-sdk/commit/2ddb8126d441b260c80b9ef3b87a24f9ce20b5be))
* **client:** preserve time zone in lenient date-time parsing ([573fcaf](https://github.com/Blooio/blooio-java-sdk/commit/573fcaf71930c387314fb18231334b542df8a47f))
* **client:** send retry count header for max retries 0 ([2ddb812](https://github.com/Blooio/blooio-java-sdk/commit/2ddb8126d441b260c80b9ef3b87a24f9ce20b5be))
* date time deserialization leniency ([b2ac60a](https://github.com/Blooio/blooio-java-sdk/commit/b2ac60a271022b4f389feee2e73467927b2c7a51))


### Chores

* **ci:** upgrade `actions/github-script` ([a32a19d](https://github.com/Blooio/blooio-java-sdk/commit/a32a19dcfbeff710c7c6c0b4daaa8ed98107294a))
* **ci:** upgrade `actions/setup-java` ([67eb04e](https://github.com/Blooio/blooio-java-sdk/commit/67eb04e66d48b47097af4e8d66f093688ff1f8ef))
* **internal:** allow passing args to `./scripts/test` ([a8da670](https://github.com/Blooio/blooio-java-sdk/commit/a8da67050906f36094fdf4cf4fb278d6abe01f58))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([d441da9](https://github.com/Blooio/blooio-java-sdk/commit/d441da9aa8607881a63e2ed14b9037fcccf1600d))
* **internal:** codegen related update ([ccf0356](https://github.com/Blooio/blooio-java-sdk/commit/ccf03561744755a1bd800449143bc61b847b17ab))
* **internal:** codegen related update ([58fcb73](https://github.com/Blooio/blooio-java-sdk/commit/58fcb730f98e0c1c1d8006b0aeb96f0aeb678a8b))
* **internal:** codegen related update ([d939776](https://github.com/Blooio/blooio-java-sdk/commit/d9397764180aeb78502302531fbc19c928fa1ab5))
* **internal:** codegen related update ([cdac773](https://github.com/Blooio/blooio-java-sdk/commit/cdac773c08fdbc1cfa3ddc812efaa40fb2da4a90))
* **internal:** codegen related update ([d5926e0](https://github.com/Blooio/blooio-java-sdk/commit/d5926e0c1019ba3d777459623b0b847a286c7b97))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([d3c3b9c](https://github.com/Blooio/blooio-java-sdk/commit/d3c3b9c5e26275edbc5897780f4338d88e65eb7d))
* **internal:** depend on packages directly in example ([2ddb812](https://github.com/Blooio/blooio-java-sdk/commit/2ddb8126d441b260c80b9ef3b87a24f9ce20b5be))
* **internal:** improve maven repo docs ([24c2d4b](https://github.com/Blooio/blooio-java-sdk/commit/24c2d4b5b8e3295a5218d2f999fd796fef269b88))
* **internal:** remove mock server code ([2720979](https://github.com/Blooio/blooio-java-sdk/commit/2720979743e942537ebb7314e83b8f64bc8e3455))
* **internal:** support uploading Maven repo artifacts to stainless package server ([d790509](https://github.com/Blooio/blooio-java-sdk/commit/d7905093b659e696e05478ee514fbbad370cc9d0))
* **internal:** update `actions/checkout` version ([8cfab13](https://github.com/Blooio/blooio-java-sdk/commit/8cfab13629687564f829968a161b50843d8ddc73))
* **internal:** update maven repo doc to include authentication ([0259720](https://github.com/Blooio/blooio-java-sdk/commit/025972007906b16f60bb8dc09ff3433c752f4be0))
* **internal:** upgrade AssertJ ([0c278a7](https://github.com/Blooio/blooio-java-sdk/commit/0c278a7a62ba05270a09d4ad6d4e0c1eadebd280))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/Blooio/blooio-java-sdk/issues/3240) in tests ([b2ac60a](https://github.com/Blooio/blooio-java-sdk/commit/b2ac60a271022b4f389feee2e73467927b2c7a51))
* update mock server docs ([00e0cf5](https://github.com/Blooio/blooio-java-sdk/commit/00e0cf57e1fb18ddcc685aeea1cce58ac6decf0c))


### Documentation

* add comment for arbitrary value fields ([a636226](https://github.com/Blooio/blooio-java-sdk/commit/a636226690a94e032e7b7d6e8fcf9d2f373bcfc3))

## 0.0.4 (2025-12-03)

Full Changelog: [v0.0.3...v0.0.4](https://github.com/Blooio/blooio-java-sdk/compare/v0.0.3...v0.0.4)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([7b9cd25](https://github.com/Blooio/blooio-java-sdk/commit/7b9cd254b0da4b4302ac19f48b58ef9eea1b9f4e))


### Documentation

* remove `$` for better copy-pasteabality ([1ebe650](https://github.com/Blooio/blooio-java-sdk/commit/1ebe65054dad73a1bd60b26fbbed197cc48c0342))

## 0.0.3 (2025-11-14)

Full Changelog: [v0.0.2...v0.0.3](https://github.com/Blooio/blooio-java-sdk/compare/v0.0.2...v0.0.3)

### Bug Fixes

* **client:** multi-value header serialization ([24c589f](https://github.com/Blooio/blooio-java-sdk/commit/24c589f877041ebe010f412841cc69302640f301))

## 0.0.2 (2025-10-17)

Full Changelog: [v0.0.1...v0.0.2](https://github.com/Blooio/blooio-java-sdk/compare/v0.0.1...v0.0.2)

### Chores

* configure new SDK language ([27e7f1c](https://github.com/Blooio/blooio-java-sdk/commit/27e7f1c09cd17a3aa5ad7ccadd4f782a5cd31ef2))
* update SDK settings ([55b1e92](https://github.com/Blooio/blooio-java-sdk/commit/55b1e9253aa7e72cfc5662ebcf09fe14a49c3f12))
