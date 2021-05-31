DROP TABLE IF EXISTS `controller`;
CREATE TABLE `controller` (
  `id` UUID DEFAULT RANDOM_UUID() NOT NULL PRIMARY KEY,
  `name` VARCHAR(250),
  `controllersManually` VARCHAR(250),
  `controllersTable` VARCHAR(250) DEFAULT NULL
);


DROP TABLE IF EXISTS `features`;
CREATE TABLE `features` (
  `id` VARCHAR(250) PRIMARY KEY,
  `eBOF` VARCHAR(250),
  `tree` VARCHAR(250),
  `summaryTree` VARCHAR(250),
  `functionalArchitectureEDT` VARCHAR(250),
  `functArchElemClassTree` VARCHAR(250),
  `functionalDomainTree` VARCHAR(250),
  `ownedByTree` VARCHAR(250),
  `statusTree` VARCHAR(250),
  `descriptionTree` VARCHAR(250),
  `introductoryModelYearTree` VARCHAR(250),
  `majorTree` VARCHAR(250),
  `minorTree` VARCHAR(250),
  `introCadenceTree` VARCHAR(250),
  `retireMajorTree` VARCHAR(250),
  `retireMinorTree` VARCHAR(250),
  `retireCadenceTree` VARCHAR(250)
);


DROP TABLE IF EXISTS `programdata`;
CREATE TABLE programdata (
  `id` VARCHAR(250) PRIMARY KEY,
  `name` VARCHAR(250),
  `programName` VARCHAR(250),
  `programVariant` VARCHAR(250),
  `momentumIDs` VARCHAR(250),
  `projectIDChartRow` VARCHAR(250),
  `projectIDChartdata` VARCHAR(250),
  `programVariantsLeftBox` VARCHAR(250),
  `group1DropdowninrightBox` VARCHAR(250),
  `group1Rightboxcontents` VARCHAR(250),
  `programPlan` VARCHAR(250),
  `programCode` VARCHAR(250),
  `modelYear` VARCHAR(250),
  `momentumID` VARCHAR(250),
  `electricalArchitecture` VARCHAR(250),
  `electricalArchitectureLevel` VARCHAR(250)
);


DROP TABLE IF EXISTS `vescom`;
CREATE TABLE `vescom` (
  `id` VARCHAR(250) PRIMARY KEY,
  `programName` VARCHAR(250),
  `baselineArchitectureLevel` VARCHAR(250),
  `eCSCadenceTiming` VARCHAR(250),
  `releasetoProgramBench` VARCHAR(250),
  `integrationRelease1` VARCHAR(250),
  `integrationRelease2` VARCHAR(250),
  `swCalFreeze` VARCHAR(250),
  `vehicleDVULTest` VARCHAR(250),
  `releaseDate` VARCHAR(250),
  `veSCoMNotes` VARCHAR(250),
  `momentumData` VARCHAR(250)
);


DROP TABLE IF EXISTS `vescomedit`;
CREATE TABLE `vescomedit` (
  `id` VARCHAR(250) PRIMARY KEY,
  `program` VARCHAR(250),
  `modelYear` VARCHAR(250),
  `electricalArchitecture` VARCHAR(250),
  `vveSCoM` VARCHAR(250),
  `baselineArchitectureLevel` VARCHAR(250),
  `programVariant` VARCHAR(250),
  `event` VARCHAR(250),
  `gVDP` VARCHAR(250),
  `dVUL` VARCHAR(250),
  `notes` VARCHAR(250),
  `eventDate` VARCHAR(250),
  `lastModifiedDate` VARCHAR(250)
);

DROP TABLE IF EXISTS `vfrp`;
CREATE TABLE `vfrp` (
  `id` VARCHAR(250) PRIMARY KEY,
  `summary` VARCHAR(250),
  `functionalArcElDes` VARCHAR(250),
  `functArchElemClass` VARCHAR(250),
  `functionalDomain` VARCHAR(250),
  `ownedBy` VARCHAR(250),
  `status` VARCHAR(250),
  `description` VARCHAR(250),
  `introductoryModelYear` VARCHAR(250),
  `major` VARCHAR(250),
  `minor` VARCHAR(250),
  `introCadence` VARCHAR(250),
  `retireMajor` VARCHAR(250),
  `retireMinor` VARCHAR(250),
  `retireCadence` VARCHAR(250)
);
