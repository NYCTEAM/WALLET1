# Token Logos

This directory contains local token logos that are bundled with the app for faster loading.

## Current Logos

### Eagle Token
- **File**: `eagle.png`
- **Networks**: BSC (56), XLAYER (196)
- **Contracts**:
  - BSC: `0x480F12D2ECEFe1660e72149c57327f5E0646E5c4`
  - XLAYER: `0x5a746ee9933627ed79822d35a3fe812eddd5ba37`

### Native Tokens (To be added)
- **BNB** (BSC native): `bnb.png` - Needed
- **OKB** (XLAYER native): `okb.png` - Needed

### Mainstream Tokens (To be added)
- **USDT**: `usdt.png` - Needed
- **USDC**: `usdc.png` - Needed
- **BUSD**: `busd.png` - Needed
- **DAI**: `dai.png` - Needed
- **USD1**: `usd1.png` - Needed
- **USDS**: `usds.png` - Needed
- **WBNB**: `wbnb.png` - Needed

## How to Add New Logos

1. Add PNG image to this directory (recommended size: 256x256px)
2. Update `token_logos.json` with the mapping
3. Logo will be loaded from local assets instead of network

## Format
- PNG format
- Transparent background recommended
- Square aspect ratio (1:1)
- Recommended size: 256x256px or 512x512px
